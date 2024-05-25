package com.br.loriens.trellointegration.shared.utils;

import java.util.regex.Pattern;

public class ConstantsUtils {
    public static final Pattern trelloIdPattern = Pattern.compile("^[0-9a-fA-F]{24}$");
}
