package cl.javadevs.springsecurityjwt.security;

public class ConstantesSeguridad {
    public static final long JWT_EXPIRATION_TOKEN = 1000 * 60 * 60 * 10; //equivaler a 5 min, donde 60000 = a 1 min
    public static final String JWT_FIRMA = "firma";
}
