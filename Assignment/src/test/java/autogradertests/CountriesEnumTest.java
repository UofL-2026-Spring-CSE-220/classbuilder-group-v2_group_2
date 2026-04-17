package autogradertests;

import edu.coolschool.utilities.CountriesEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountriesEnumTest {

    @Test
    @DisplayName("Test CountriesEnum")
    public void testCountriesEnum() {
        assertEquals("Afghanistan", CountriesEnum.AF.toString());
        assertEquals("Albania", CountriesEnum.AL.toString());
        assertEquals("Algeria", CountriesEnum.DZ.toString());
        assertEquals("Andorra", CountriesEnum.AD.toString());
        assertEquals("Angola", CountriesEnum.AO.toString());
        assertEquals("Antigua and Barbuda", CountriesEnum.AG.toString());
        assertEquals("Argentina", CountriesEnum.AR.toString());
        assertEquals("Armenia", CountriesEnum.AM.toString());
        assertEquals("Australia", CountriesEnum.AU.toString());
        assertEquals("Austria", CountriesEnum.AT.toString());
        assertEquals("Azerbaijan", CountriesEnum.AZ.toString());
        assertEquals("Bahamas", CountriesEnum.BS.toString());
        assertEquals("Bahrain", CountriesEnum.BH.toString());
        assertEquals("Bangladesh", CountriesEnum.BD.toString());
        assertEquals("Barbados", CountriesEnum.BB.toString());
        assertEquals("Belarus", CountriesEnum.BY.toString());
        assertEquals("Belgium", CountriesEnum.BE.toString());
        assertEquals("Belize", CountriesEnum.BZ.toString());
        assertEquals("Benin", CountriesEnum.BJ.toString());
        assertEquals("Bhutan", CountriesEnum.BT.toString());
        assertEquals("Bolivia", CountriesEnum.BO.toString());
        assertEquals("Bosnia and Herzegovina", CountriesEnum.BA.toString());
        assertEquals("Brazil", CountriesEnum.BR.toString());
        assertEquals("Brunei", CountriesEnum.BN.toString());
        assertEquals("Bulgaria", CountriesEnum.BG.toString());
        assertEquals("Burkina Faso", CountriesEnum.BF.toString());
        assertEquals("Burundi", CountriesEnum.BI.toString());
        assertEquals("Cabo Verde", CountriesEnum.CV.toString());
        assertEquals("Cambodia", CountriesEnum.KH.toString());
        assertEquals("Cameroon", CountriesEnum.CM.toString());
        assertEquals("Canada", CountriesEnum.CA.toString());
        assertEquals("Central African Republic", CountriesEnum.CF.toString());
        assertEquals("Chad", CountriesEnum.TD.toString());
        assertEquals("Chile", CountriesEnum.CL.toString());
        assertEquals("China", CountriesEnum.CN.toString());
        assertEquals("Colombia", CountriesEnum.CO.toString());
        assertEquals("Comoros", CountriesEnum.KM.toString());

    }

    @Test
    @DisplayName("Test CountriesEnum Fullname")
    public void testCountriesEnum2() {
        assertEquals("Afghanistan", CountriesEnum.AF.getDisplayName());
        assertEquals("Albania", CountriesEnum.AL.getDisplayName());
        assertEquals("Algeria", CountriesEnum.DZ.getDisplayName());
        assertEquals("Andorra", CountriesEnum.AD.getDisplayName());
        assertEquals("Angola", CountriesEnum.AO.getDisplayName());
        assertEquals("Antigua and Barbuda", CountriesEnum.AG.getDisplayName());
        assertEquals("Argentina", CountriesEnum.AR.getDisplayName());
        assertEquals("Armenia", CountriesEnum.AM.getDisplayName());
        assertEquals("Australia", CountriesEnum.AU.getDisplayName());
        assertEquals("Austria", CountriesEnum.AT.getDisplayName());
        assertEquals("Azerbaijan", CountriesEnum.AZ.getDisplayName());
        assertEquals("Bahamas", CountriesEnum.BS.getDisplayName());
        assertEquals("Bahrain", CountriesEnum.BH.getDisplayName());
        assertEquals("Bangladesh", CountriesEnum.BD.getDisplayName());
        assertEquals("Barbados", CountriesEnum.BB.getDisplayName());
        assertEquals("Belarus", CountriesEnum.BY.getDisplayName());
        assertEquals("Belgium", CountriesEnum.BE.getDisplayName());
        assertEquals("Belize", CountriesEnum.BZ.getDisplayName());
        assertEquals("Benin", CountriesEnum.BJ.getDisplayName());
        assertEquals("Bhutan", CountriesEnum.BT.getDisplayName());
        assertEquals("Bolivia", CountriesEnum.BO.getDisplayName());
        assertEquals("Bosnia and Herzegovina", CountriesEnum.BA.getDisplayName());
        assertEquals("Brazil", CountriesEnum.BR.getDisplayName());
        assertEquals("Brunei", CountriesEnum.BN.getDisplayName());
        assertEquals("Bulgaria", CountriesEnum.BG.getDisplayName());
        assertEquals("Burkina Faso", CountriesEnum.BF.getDisplayName());
        assertEquals("Burundi", CountriesEnum.BI.getDisplayName());
        assertEquals("Cabo Verde", CountriesEnum.CV.getDisplayName());
        assertEquals("Cambodia", CountriesEnum.KH.getDisplayName());
        assertEquals("Cameroon", CountriesEnum.CM.getDisplayName());
        assertEquals("Canada", CountriesEnum.CA.getDisplayName());
        assertEquals("Central African Republic", CountriesEnum.CF.getDisplayName());
        assertEquals("Chad", CountriesEnum.TD.getDisplayName());
        assertEquals("Chile", CountriesEnum.CL.getDisplayName());
        assertEquals("China", CountriesEnum.CN.getDisplayName());
        assertEquals("Colombia", CountriesEnum.CO.getDisplayName());
        assertEquals("Comoros", CountriesEnum.KM.getDisplayName());
    }
}
