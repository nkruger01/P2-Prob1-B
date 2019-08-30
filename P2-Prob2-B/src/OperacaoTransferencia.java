
import java.util.Calendar;
import java.util.Date;

public class OperacaoTransferencia extends Operacao{
    private ContaCorrente contaPartida;

    public ContaCorrente getContaPartida() {
        return contaPartida;
    }

    public void setContaPartida(ContaCorrente contaPartida) {
        this.contaPartida = contaPartida;
    }

}
