package com.servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author osmar
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface MensagemServico {
    
    @WebMethod
    public String getMensagem();
    
    @WebMethod
    public void setMensagem(String mensagem);
}
