package ExerSemana3.Main.interfaces;

import java.time.LocalDateTime;
import java.util.Date;

public interface emprestimo {
    default void emprestar(Date dataEmprestimo){}
    default void devolver(Date dataEmprestimo, float juros){};
}
