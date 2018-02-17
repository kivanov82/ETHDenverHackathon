package co.loyalgarden.ethdenver.referal.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Date: 17-Feb-18
 * Time: 18:07
 */

@RestController
public class TransactionController {


    @RequestMapping(value = "/transaction.json", method = RequestMethod.GET)
    void transfer(@RequestParam String recipient, @RequestParam String amount) {
        System.out.println(recipient);
        System.out.println(amount);
    }
}
