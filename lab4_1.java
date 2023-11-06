public class Main {
    public static void main(String[] args) {
        String cuvant = "masina";
        String mijloc = getCaractereMijloc(cuvant);
        System.out.println("Mijlocul cuvântului: " + mijloc);
    }

    public static String getCaractereMijloc(String cuvant) {
        int lungime = cuvant.length();

        if (lungime % 2 == 0) {
            int mijloc1 = lungime / 2 - 1;
            int mijloc2 = lungime / 2;
            return cuvant.substring(mijloc1, mijloc2 + 1);
        } else {
            int mijloc = lungime / 2;
            return cuvant.substring(mijloc, mijloc + 1);
        }
    }
