package pl.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import pl.api.InterfejsZapiekanka;
import pl.impl.Zapiekanka;

@Aspect
public class AspektZapiekanka {
@DeclareParents(value = "pl.api.IKucharz+", defaultImpl = Zapiekanka.class)
    public static InterfejsZapiekanka interfejsZapiekanka;


}
