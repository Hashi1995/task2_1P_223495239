package sit707_week2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int choice = 2;

        switch (choice) {
            case 1:
                SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
                break;
            case 2:
                SeleniumOperations.amazon_registration_page("https://www.amazon.com.au/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.au%2Fgp%2Fcss%2Fhomepage.html%2Fref%3Dnav_bb_ya%2F%3Fie%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=auflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
                break;
            case 3:
                SeleniumOperations.facebook_registration_page("https://www.facebook.com/signup");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}