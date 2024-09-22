import com.Hospital.Financial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Financial FR = new Financial("Ahmed", "342 Main Street Kampala", 191, "+256 70-735-0034", "General Hospital of East Africa", "Street 076ub", 350000);


            System.out.println("Accessed Patient Records: " + FR.getPatientRecords());
}
    }


