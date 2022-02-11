package validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {
	/**
	 * Valida que una cadena de caracteres contiene dígitos únicamente
	 * 
	 * @param tfn cadena con el telefono a validar
	 * @return true si es un telefono válido o false en caso contrario
	 */
	public static boolean validarTelefono(String tfn) {
		return tfn.trim().chars().allMatch(Character::isDigit);
	}

	/**
	 * Valida que una cadena de caracteres contiene letras o espacios únicamente,
	 * longitud entre 3 y 50 caractreres
	 * 
	 * @param nombre cadena con el nombre a validar
	 * @return true si es un nombre válido o false en caso contrario
	 */
	public static boolean validarNombre(String nombre) {
		// regEx general para cadena de caracteres con longitud entre 1 y 50 caracteres,
		// aceptando dígitos, letras MAYUS y minúsculas, con tildes, diréresis y
		// diferentes símbolos especiales
		// Pattern patron = Pattern.compile("[
		// 0-9A-Za-zñÑáéíóúÁÉÍÓÚäëïöüÄËÏÖÜ¡!¿?@#$%()=+-€/.,]{1,50}");
		Pattern patron = Pattern.compile("[ A-Za-zñÑáéíóúÁÉÍÓÚäëïöüÄËÏÖÜ-]{3,50}");
		Matcher comprobacion = patron.matcher(nombre);
		return comprobacion.matches();//
	}
	
	public static boolean validarIdManager(long idManager) {
		if (idManager > 1 || idManager < 99999999)
		return true;
	return false;
	}
}
