public class Main {
    public static void main(String[] args) {
        String[] validEmails = new String[4];
        validEmails[0] = "@gmail.com";
        validEmails[1] = "@outlook.com";
        validEmails[2] = "@hotmail.com";
        validEmails[3] = "@morelia.tecnm.mx";

        Validator emailValidator = (email) -> {
            if (!email.contains("@")) {
                return false;
            }

            int counter = 0;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@')
                    counter ++;
            }
            if (counter > 1)
                return false;

            return stringEndsWithOneOf( email, validEmails);
        } ;

        System.out.println(emailValidator.validate("candeChambas@gmail.com@outlook.com"));
        System.out.println(emailValidator.validate("l23121067@morelia.tecnm.mx"));

    }

    public static boolean stringEndsWithOneOf( String toValidate, String[] arr) {
        for (String s : arr) {
            if (toValidate.endsWith(s))
                return true;
        }

        return false;
    }
}
