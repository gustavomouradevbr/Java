package entities;

/**
 * Define o perfil do cliente para regras de desconto.
 */
public enum ClientType {
    REGULAR,
    PREMIUM;

    /**
     * Interpreta entrada textual do usuario para manter o exercicio amigavel.
     */
    public static ClientType fromUserInput(String rawValue) {
        if (rawValue == null) {
            return REGULAR;
        }

        String normalized = rawValue.trim().toUpperCase();
        if ("SIM".equals(normalized) || "S".equals(normalized) || "PREMIUM".equals(normalized)) {
            return PREMIUM;
        }
        return REGULAR;
    }
}

