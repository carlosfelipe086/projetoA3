package br.com.projetoA3;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@OpenAPIDefinition(
    info =
        @Info(
            title = "API Sistema Bancario",
            version = "1.0",
            description =
                "Essa API de simula um sistema bancário, permitindo a criação de um usuario, que pode criar uma conta"
                    + " e que pode fazer transações para outras contas de outros usuarios"))
public class ProjetoA3BancoApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProjetoA3BancoApplication.class, args);
  }
}
