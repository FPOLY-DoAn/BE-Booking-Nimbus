package com.BE_FPoly_DoAn.DOAN.Security;

import com.BE_FPoly_DoAn.DOAN.Fillter.JwtFillter;
import com.BE_FPoly_DoAn.DOAN.Service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Arrays;

@Configuration
@ComponentScan
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class ConfigSecurity {

    @Autowired
    private JwtFillter jwtFillter;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder(12);
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(NguoiDungService nguoiDungService) {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(nguoiDungService);
        daoAuthenticationProvider.setPasswordEncoder(bCryptPasswordEncoder());
        return daoAuthenticationProvider;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authz -> authz
                .requestMatchers(
                        "/swagger-ui/**",
                        "/swagger-ui.html",
                        "/v3/api-docs/**",
                        "/swagger-resources/**",
                        "/webjars/**"
                ).permitAll()
                .requestMatchers(HttpMethod.POST, "/auth/*").permitAll()
                .requestMatchers(HttpMethod.GET, "/auth/*").permitAll()
                .anyRequest().authenticated());
        http.cors(
                        cors -> {
                            cors.configurationSource(
                                    request -> {
                                        CorsConfiguration corsConfig = new CorsConfiguration();
                                        corsConfig.addAllowedOrigin("http://localhost:3000/");
                                        corsConfig.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
                                        corsConfig.addAllowedHeader("*");
                                        corsConfig.setAllowCredentials(true);
                                        return corsConfig;
                                    });
                        })

                .addFilterBefore(jwtFillter, UsernamePasswordAuthenticationFilter.class)
                .csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
}
