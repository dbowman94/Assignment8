public class Password {
    private static Password password = new Password();

    public Password password(boolean character, boolean capitalletter, boolean lowercaseletter, boolean number) {
        StringBuilder passwordString = new StringBuilder();

        if (character) {
            passwordString.append("\"(?=.*[#$])\"");
        }

        if (capitalletter) {
            passwordString.append("\"(?=.*[A-Z])\"");
        }

        if (lowercaseletter) {
            passwordString.append("\"(?=.*[a-z])\"");
        }

        if (number) {
            passwordString.append("\"(?=.*[0-5])\"");
        }

        else {
            System.out.println("Not a valid Password");
        }
        return password;
    }
}
