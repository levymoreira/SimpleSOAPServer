package com.levymoreira.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.levymoreira.ws.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface {

	@Override
	public Produto printMessage(Produto produto) {
		if(produto!=null){
			produto.setNome(produto.getNome()+" - ALTERADO NO SERVIDOR!");
		}
		return produto;
	}

}
