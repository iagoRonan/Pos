package ecommerce.pos.models;

public class FormaPagamento {

	private int codigo;
	private String dataPagamento;
	private boolean confirmacaoPagamento = false;
	
	public FormaPagamento(int codigo, String dataPagamento) {
		this.codigo = codigo;
                this.dataPagamento = dataPagamento;
	}

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

	public String getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void realizaPagamento(boolean flag, String data){
		if (flag){
			System.out.println("\npagamento realizado!");
			confirmacaoPagamento = true;
			this.dataPagamento = data;
		}else{
			confirmacaoPagamento = false;
		}
	}

	@Override
	public String toString() {
		return "FormaPagamento [codPagamento: " + codigo + "\n dataPagamento=" + dataPagamento
				+ ", confirmacaoPagamento=" + confirmacaoPagamento + "]";
	}
	
	
}
