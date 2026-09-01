public class PasswordChecker41 {
    public boolean lengthRule(String pw) {
        return pw.length() >= 8;
    }

    public boolean upperRule(String pw) {
        return pw.matches(".*[A-Z].*");
    }

    public boolean digitRule(String pw) {
        return pw.matches(".*[0-9].*");
    }

    public boolean specialRule(String pw) {
        return pw.matches(".*[^a-zA-Z0-9].*");
    }

    public String strength(String pw) {
        int count = 0;

        if (lengthRule(pw))
            count++;
        if (upperRule(pw))
            count++;
        if (digitRule(pw))
            count++;
        if (specialRule(pw))
            count++;

        if (count <= 1)
            return "Weak";
        else if (count>1 &&count <= 3)
            return "Medium";
        else
            return "Strong";
    }
}