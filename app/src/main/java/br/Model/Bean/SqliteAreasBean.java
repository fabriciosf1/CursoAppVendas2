package br.Model.Bean;

public class SqliteAreasBean {

    private Integer MobileAreaID;
    private String CodProdutor;
    private String CodFazenda;
    private Integer CulturaSAPID;
    private Integer CulturaID;
    private String EnderecoArea;
    private String EnderecoProdutividade;
    private String Ano;
    private String AnoSafra;
    private Integer Exportou;

    public Integer getMobileAreaID() {
        return MobileAreaID;
    }

    public void setMobileAreaID(Integer mobileAreaID) {
        MobileAreaID = mobileAreaID;
    }

    public String getCodProdutor() {
        return CodProdutor;
    }

    public void setCodProdutor(String codProdutor) {
        CodProdutor = codProdutor;
    }

    public String getCodFazenda() {
        return CodFazenda;
    }

    public void setCodFazenda(String codFazenda) {
        CodFazenda = codFazenda;
    }

    public Integer getCulturaSAPID() {
        return CulturaSAPID;
    }

    public void setCulturaSAPID(Integer culturaSAPID) {
        CulturaSAPID = culturaSAPID;
    }

    public Integer getCulturaID() {
        return CulturaID;
    }

    public void setCulturaID(Integer culturaID) {
        CulturaID = culturaID;
    }

    public String getEnderecoArea() {
        return EnderecoArea;
    }

    public void setEnderecoArea(String enderecoArea) {
        EnderecoArea = enderecoArea;
    }

    public String getEnderecoProdutividade() {
        return EnderecoProdutividade;
    }

    public void setEnderecoProdutividade(String enderecoProdutividade) {
        EnderecoProdutividade = enderecoProdutividade;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getAnoSafra() {
        return AnoSafra;
    }

    public void setAnoSafra(String anoSafra) {
        AnoSafra = anoSafra;
    }

    public Integer getExportou() {
        return Exportou;
    }

    public void setExportou(Integer exportou) {
        Exportou = exportou;
    }
}
