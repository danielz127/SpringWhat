package pl.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Komunikacja {

    @Pointcut("args(argumentInt)")
    public void pointcutInt(int argumentInt) {

    }

    @Pointcut("target(pl.api.IKucharz)")
    public void pointcutTarget() {

    }

    @Pointcut("@target(annotation)")
    public void pointcutTargetAnnotation(Deprecated annotation) {

    }

    @Pointcut("within(pl.impl.Kucharz)")
    public void pointcutWithin() {

    }

    @Before("pointcutWithin() && pointcutInt(arg)")
    public void porada(int arg) {
        System.out.println("Porada(przechwytuje typ int i obiekt kucharz) "+ arg);

    }

    @After("execution(* pl.impl.Kucharz.pobierzSkladnikiZMagazynu(..)) && args(liczbaS))")
    public void poinformujOPobraniuSkladnikow(int liczbaS) {
        System.out.println("Pobrano: " + liczbaS + " skladniki");
    }

    @Around("execution(* pl.impl.Kucharz.wydajPizze(..))")
    public void wydaniePizzy(ProceedingJoinPoint point) {
        try {
            System.out.println("Kominikuje, ze pizza jest gotowa");
            point.proceed();
            System.out.println("Kominikuje, ze wydano pizze");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
