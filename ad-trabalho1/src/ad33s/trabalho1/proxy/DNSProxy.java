/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad33s.trabalho1.proxy;

import ad33s.trabalho1.interfaces.DominioJaRegistrado;
import ad33s.trabalho1.interfaces.DominioNaoRegistrado;
import ad33s.trabalho1.interfaces.IDNS;

/**
 *
 * @author favarim
 */
public class DNSProxy implements IDNS {
    private final String ipDNS;
    private final int portaDNS;

    public DNSProxy(String ipDNS, int portaDNS) {
        this.ipDNS = ipDNS;
        this.portaDNS = portaDNS;
    }
    
    @Override
    public String bind(String dominio, String IP, int porta) throws DominioJaRegistrado {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String lookup(String dominio) throws DominioNaoRegistrado {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String unbind(String dominio) throws DominioNaoRegistrado {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
