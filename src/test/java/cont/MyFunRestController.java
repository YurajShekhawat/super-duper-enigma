package cont;

import net.bytebuddy.asm.Advice;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

@RestController
public class MyFunRestController {

    public String getMessage(){
        return "hello, date and time right now are ( "+ LocalDateTime.now()+" )";
    }
}
