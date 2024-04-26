public class Main {
    public static void main(String[] args) {

        Validator emailValidator = (email) -> {
            if (!email.contains("@")) {
                return false;
            }

            if (email.indexOf('@') == 0)
                return false;

            int counter = 0;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@')
                    counter ++;
            }
            if (counter > 1)
                return false;

            return stringEndsWithOneOfValid( email);
        } ;

        System.out.println(emailValidator.validate("candeChambas@gmail.com@outlook.com"));
        System.out.println(emailValidator.validate("@hotmail.com"));
        System.out.println(emailValidator.validate("l23121067@morelia.tecnm.mx"));

    }

    public static boolean stringEndsWithOneOfValid(String toValidate) {
        String[] validEmails = new String[4];
        validEmails[0] = "@gmail.com";
        validEmails[1] = "@outlook.com";
        validEmails[2] = "@hotmail.com";
        validEmails[3] = "@morelia.tecnm.mx";

        for (String s : validEmails) {
            if (toValidate.endsWith(s))
                return true;
        }

        return false;
    }
}
