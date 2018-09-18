/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad33s.trabalho1.proxy;

import ad33s.trabalho1.interfaces.IPOP;
import ad33s.trabalho1.interfaces.msgEmail;
import java.util.List;

/**
 *
 * @author favarim
 */
public class POPProxy implements IPOP {
    private final String ipDNS;
    private final int portaDNS;

    public POPProxy(String ipDNS, int portaDNS) {
        this.ipDNS = ipDNS;
        this.portaDNS = portaDNS;
    }
    

    @Override
    public List<msgEmail> ler(String usuario, boolean manterMsgs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
