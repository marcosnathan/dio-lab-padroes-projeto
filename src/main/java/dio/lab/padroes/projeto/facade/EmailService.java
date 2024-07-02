package dio.lab.padroes.projeto.facade;

public class EmailService {
    public void enviaEmailConfirmacao(String email) {
        System.out.printf("e-mail enviado para %s\n", email);
    }
}
