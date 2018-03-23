package pl.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class KontrolaMagazynu {
    @Pointcut("execution(* pl.impl.Kucharz.pobierzSkladnikiZMagazynu(..))")
    public void pointCut(){}

    @Before("execution(* pl.impl.Kucharz.pobierzSkladnikiZMagazynu(..))")
    public void sprawdzSkladnikiMagazynu(){
        System.out.println("Sprawdzam stan magazynu");
    };

    @AfterThrowing("execution(* pl.impl.Kucharz.pobierzSkladnikiZMagazynu(..))")
    public void sygnalizujBrakiMagazynu(){
        System.out.println("Braki w magazynie!");
    }
}
