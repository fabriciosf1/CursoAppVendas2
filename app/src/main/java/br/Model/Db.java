package br.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Db extends SQLiteOpenHelper {

    public static String Dbname = "vendas.db";
    public static int version = 1;

    public Db(Context ctx) {
        super(ctx, Dbname, null, version);
    }

    private static String SQL_AGENDA = "CREATE TABLE IF NOT EXISTS tb_PIN_Visita (" +
            "MobilePINVisitaID integer primary key autoincrement, " +
            "ID, " +
            "CodProdutor, " +
            "CodFazenda, " +
            "HashPlanoAcao, " +
            "TipoPINID, " +
            "CD_MAQUINA, " +
            "Diagnostico, " +
            "Responsavel, " +
            "Resultado, " +
            "DataInicial, " +
            "DataFinal, " +
            "Altitude1, " +
            "Latitude1, " +
            "Longitude1, " +
            "Altitude2, " +
            "Latitude2, " +
            "Longitude2, " +
            "Foto1, " +
            "Foto2, " +
            "Hash, " +
            "Exportou, " +
            "StatusAgenda, " +
            "ItemID, " +
            "MotivoRecusaID" +
            ")";

    private static String SQL_AREAS= "CREATE TABLE IF NOT EXISTS tb_Produtor_Endereco_Area (" +
            "MobileAreaID integer primary key autoincrement, " +
            "CodProdutor, " +
            "CodFazenda, " +
            "CulturaSAPID, " +
            "CulturaID, " +
            "EnderecoArea, " +
            "EnderecoProdutividade, " +
            "Ano, " +
            "AnoSafra, " +
            "Exportou" +
            ")";

    private static String SQL_CATEGORIAS = "CREATE TABLE IF NOT EXISTS tb_Categoria (" +
            "MobileCategoriaID integer primary key autoincrement, " +
            "CodCategoria, " +
            "Categoria" +
            ")";

    private static String SQL_CIDADES = "CREATE TABLE IF NOT EXISTS tb_Cidade (" +
            "MobileCidadeID integer primary key autoincrement, " +
            "Cidade, " +
            "UF, " +
            "IBGE, " +
            "Latitude, " +
            "Longitude" +
            ")";

    private static String SQL_CIDADE_VENDEDOR = "CREATE TABLE IF NOT EXISTS tb_Cidade_Vendedor (" +
            "MobileCidadeVendedorID integer primary key autoincrement, " +
            "UF, " +
            "IBGE" +
            ")";

    private static String SQL_COTACAO_INDEXADOR = "CREATE TABLE IF NOT EXISTS tb_Cotacao_Indexador (" +
            "MobileCotacaoIndexadorID integer primary key autoincrement, " +
            "CodIndexador, " +
            "DataCotacaoIndexador, " +
            "ValorCotacaoIndexador" +
            ")";

    private static String SQL_CULTURA = "CREATE TABLE IF NOT EXISTS tb_Cultura_SAP (" +
            "MobileCulturaSAPID integer primary key autoincrement, " +
            "CulturaSAPID, " +
            "CulturaSAP" +
            ")";

    private static String SQL_CULTURA_SAP = "CREATE TABLE IF NOT EXISTS tb_Cultura_SAP (" +
            "MobileCulturaSAPID integer primary key autoincrement, " +
            "CulturaSAPID, " +
            "CulturaSAP" +
            ")";

    private static String SQL_ESTADOS = "CREATE TABLE IF NOT EXISTS tb_Estado (" +
            "MobileEstadoID integer primary key autoincrement, " +
            "UF, " +
            "Estado" +
            ")";

    private static String SQL_FAMILIA_CONCESSIONARIA = "CREATE TABLE IF NOT EXISTS tb_Familia_Concessionaria (" +
            "MobileFamiliaID integer primary key autoincrement, " +
            "CD_FAMILIA, " +
            "CD_FAMILIA_CONCESSIONARIA, " +
            "CODIGO, " +
            "SIGLA, " +
            "DESCRICAO, " +
            "CODMARCA" +
            ")";

    private static String SQL_FAZENDA = "CREATE TABLE IF NOT EXISTS tb_Produtor_Endereco (" +
            "MobileEnderecoID integer primary key autoincrement, " +
            "CodProdutor, " +
            "CodFazenda, " +
            "Estado, " +
            "IBGE, " +
            "RazaoSocial, " +
            "NomeFantasia, " +
            "Inscricao, " +
            "Telefone, " +
            "Telefone2, " +
            "Localizacao, " +
            "Latitude, " +
            "Longitude, " +
            "Exportou" +
            ")";

    private static String SQL_FORMA_PAGAMENTO = "CREATE TABLE IF NOT EXISTS tb_Forma_Pagamento (" +
            "MobileFormaPagamentoID integer primary key autoincrement, " +
            "CodFormaPagamento, " +
            "FormaPagamento" +
            ")";

    private static String SQL_GRUPO = "CREATE TABLE IF NOT EXISTS tb_Grupo (" +
            "MobileGrupoID integer primary key autoincrement, " +
            "CodGrupo, " +
            "Grupo" +
            ")";

    private static String SQL_INDEXADORES = "CREATE TABLE IF NOT EXISTS tb_Indexador (" +
            "MobileIndexadorID integer primary key autoincrement, " +
            "CodIndexador, " +
            "Indexador, " +
            "CulturaCodConcessionariaID, " +
            "CulturaID, " +
            "Unidade, " +
            "Barter" +
            ")";

    private static String SQL_MARCAS = "CREATE TABLE IF NOT EXISTS tb_Marca (" +
            "MobileMarcaID integer primary key autoincrement, " +
            "CD_MARCA, " +
            "DS_MARCA";

    private static String SQL_MAQUINAS = "CREATE TABLE IF NOT EXISTS tb_Maquina (" +
            "MobileMaquinaID integer primary key autoincrement, " +
            "CODPRODUTOR, " +
            "CD_MAQUINA, " +
            "CD_MARCA, " +
            "CD_MODELO, " +
            "CODIGO, " +
            "DESCRICAO, " +
            "VALOR, " +
            "CHASSI, " +
            "ANOMODELO, " +
            "ANOFABRICACAO, " +
            "DT_RETIRADA, " +
            "VL_FINANCIADO, " +
            "VL_PARCELA, " +
            "DT_INICIO_PARCELA, " +
            "FOTO, " +
            "Exportou" +
            ")";

    private static String SQL_MAQUINA_HORIMETROS = "CREATE TABLE IF NOT EXISTS tb_Maquina_Horimetro (" +
            "MobileHorimetroID integer primary key autoincrement, " +
            "CD_MAQUINA, " +
            "NR_HORIMETRO, " +
            "DATA, " +
            "CulturaID, " +
            "CODPRODUTOR, " +
            "Exportou" +
            ")";

    private static String SQL_MAQUINA_MANUTENCOES = "CREATE TABLE IF NOT EXISTS tb_Maquina_Manutencao (" +
            "MobileManutencaoID integer primary key autoincrement, " +
            "CD_MAQUINA, " +
            "CD_MODELO_MANUTENCAO, " +
            "DT_MANUTENCAO, " +
            "HR_MANUTENCAO, " +
            "OBSERVACOES, " +
            "Exportou" +
            ")";


    private static String SQL_MENSAGENS = "CREATE TABLE IF NOT EXISTS tb_Mensagem (" +
            "MobileMensagemID integer primary key autoincrement, " +
            "MensagemID, " +
            "Tipo, " +
            "Titulo, " +
            "Mensagem, " +
            "Data" +
            ")";

    private static String SQL_MENSAGENS_HISTOTICO = "CREATE TABLE IF NOT EXISTS tb_Mensagem_Historico (" +
            "MobileMensagemHistoricoID integer primary key autoincrement, " +
            "MensagemID, " +
            "Abriu, " +
            "Ano" +
            ")";


    private static String SQL_MODELOS = "CREATE TABLE IF NOT EXISTS tb_Modelo (" +
            "MobileModeloID integer primary key autoincrement, " +
            "CD_MODELO, " +
            "DS_MODELO, " +
            "CD_MARCA, " +
            "CD_MODELO_FAMILIA, " +
            "VIDA_UTIL_HRS, " +
            "HP, " +
            "CODIGO" +
            ")";

    private static String SQL_MODELO_MANUTENCOES = "CREATE TABLE IF NOT EXISTS tb_Modelo_Manutencao (" +
            "MobileMMID integer primary key autoincrement, " +
            "CD_MODELO_MANUTENCAO, " +
            "CD_MODELO, " +
            "DS_ETAPA, " +
            "HORIMETRO, " +
            "MES, " +
            "VALOR" +
            ")";

    private static String SQL_MODO_PAGAMENTO = "CREATE TABLE IF NOT EXISTS tb_Modo_Pagamento (" +
            "MobileModoPagamentoID integer primary key autoincrement, " +
            "CodModoPagamento," +
            " ModoPagamento" +
            ")";

    private static String SQL_MOTIVO_RECUSA = "CREATE TABLE IF NOT EXISTS tb_motivo_recusa (" +
            "MobileMotivoRecusaID integer primary key autoincrement, " +
            "MotivoRecusaID, " +
            "CodConcessionaria, " +
            "MotivoRecusa" +
            ")";

    private static String SQL_PEDIDOS = "CREATE TABLE IF NOT EXISTS tb_Pedido (" +
            "MobilePedidoID integer primary key autoincrement, " +
            "Hash, " +
            "NumPedido, " +
            "CodFazenda, " +
            "CodProdutor, " +
            "ID, " +
            "DataPedido, " +
            "DataFaturamento, " +
            "CodFormaPagamento, " +
            "FormaPagamento, " +
            "CodModoPagamento, " +
            "ModoPagamento, " +
            "CodTabela, " +
            "Observacao, " +
            "ObservacaoComercio, " +
            "ValorTotal, " +
            "Responsavel, " +
            "Documento, " +
            "Assinatura, " +
            "Exportou, " +
            "FotoPedido, " +
            "ExisteItem, " +
            "StatusPed" +
            ")";

    private static String SQL_PEDIDO_ITENS = "CREATE TABLE IF NOT EXISTS tb_Pedido_Item (" +
            "MobilePedidoItemID integer primary key autoincrement, " +
            "Hash, " +
            "CodProduto, " +
            "CodTabela, " +
            "Descricao, " +
            "Quantidade, " +
            "ValorMin, " +
            "ValorTabela, " +
            "ValorUnitario, " +
            "Margem, " +
            "Comissao, " +
            "Exportou, " +
            "CD_MAQUINA, " +
            "CD_STATUS, " +
            "CodCategoria, " +
            "DataInteresse, " +
            "IHash, " +
            "IHashDestino" +
            ")";

    private static String SQL_PEDIDO_FATURAS = "CREATE TABLE IF NOT EXISTS tb_Pedido_Fatura (" +
            "MobilePedidoFaturaID integer primary key autoincrement, " +
            "NumPedido, " +
            "CodProdutor, " +
            "CodProduto, " +
            "Referencia, " +
            "Quantidade, " +
            "Valor, " +
            "Data" +
            ")";

    private static String SQL_PEDIDO_STATUS = "CREATE TABLE IF NOT EXISTS tb_Status (" +
            "MobileStatusID integer primary key autoincrement, " +
            "CD_STATUS, " +
            "STATUS, " +
            "COR, " +
            "ORDEM, " +
            "SIGLA, " +
            "PRAZO, " +
            "CATEGORIAID" +
            ")";

    private static String SQL_PIN_TIPO = "CREATE TABLE IF NOT EXISTS tb_PIN_Tipo (" +
            "MobilePINTipoID integer primary key autoincrement, " +
            "TipoPINID, " +
            "TipoPIN)";

    private static String SQL_PIN_CONCORRENTE = "CREATE TABLE IF NOT EXISTS tb_PIN_Concorrente (MobileConcorrenteID integer primary key autoincrement, " +
            "ConcorrenteID, " +
            "Concorrente" +
            ")";

    private static String SQL_PIN_SWOT = "CREATE TABLE IF NOT EXISTS tb_PIN_Swot (" +
            "MobilePINSwotID integer primary key autoincrement, " +
            "ID, " +
            "CodProdutor, " +
            "PFortes, " +
            "PFracos, " +
            "Oportunidades, " +
            "Ameacas, " +
            "FatoresCriticosSucesso, " +
            "Ano, " +
            "Hash, " +
            "Exportou" +
            ")";

    private static String SQL_PIN_PLANO_ACAO_PILAR = "CREATE TABLE IF NOT EXISTS tb_PIN_Plano_Acao_Pilar (" +
            "MobilePlanoAcaoPilarID integer primary key autoincrement, " +
            "PinPlanoAcaoPilarID, " +
            "PinPlanoAcaoPilar" +
            ")";

    private static String SQL_PIN_PLANO_ACAO = "CREATE TABLE IF NOT EXISTS tb_PIN_Plano_Acao (" +
            "MobilePlanoAcaoID integer primary key autoincrement, " +
            "ID, " +
            "CodProdutor, " +
            "PinPlanoAcaoPilarID, " +
            "Acoes, " +
            "Resultados, " +
            "InicioMes, " +
            "InicioAno, " +
            "FimMes, " +
            "FimAno, " +
            "Hash, " +
            "Exportou" +
            ")";

    private static String SQL_PIN_ANALISE_CONCORRENCIA = "CREATE TABLE IF NOT EXISTS tb_PIN_Analise_Concorrencia (" +
            "MobileConcorrenciaID integer primary key autoincrement, " +
            "ID, " +
            "CodProdutor, " +
            "Acoes, " +
            "Peso, " +
            "Empresa, " +
            "Concorrente, " +
            "Ano, " +
            "Hash, " +
            "Exportou" +
            ")";

    private static String SQL_PIN_VISITA = "CREATE TABLE IF NOT EXISTS tb_PIN_Visita (" +
            "MobilePINVisitaID integer primary key autoincrement, " +
            "ID, " +
            "CodProdutor, " +
            "CodFazenda, " +
            "HashPlanoAcao, " +
            "TipoPINID, " +
            "CD_MAQUINA, " +
            "Diagnostico, " +
            "Responsavel, " +
            "Resultado, " +
            "DataInicial, " +
            "DataFinal, " +
            "Altitude1, " +
            "Latitude1, " +
            "Longitude1, " +
            "Altitude2, " +
            "Latitude2, " +
            "Longitude2, " +
            "Foto1, " +
            "Foto2, " +
            "Hash, " +
            "Exportou, " +
            "StatusAgenda, " +
            "ItemID, " +
            "MotivoRecusaID" +
            ")";

    private static String SQL_PRODUTOS = "CREATE TABLE IF NOT EXISTS tb_Produto (" +
            "MobileProdutoID integer primary key autoincrement, " +
            "CategoriaID, " +
            "CodFabricante, " +
            "CodGrupo, " +
            "CodProduto, " +
            "Descricao, " +
            "Unidade, " +
            "Multiplo, " +
            "Estoque" +
            ")";

    private static String SQL_PRODUTO_ESTOQUE = "CREATE TABLE IF NOT EXISTS tb_Produto_estoque (" +
            "MobileProdutoEstoqueID integer primary key autoincrement, " +
            "CodProduto, " +
            "CodFilial, " +
            "Estoque" +
            ")";

    private static String SQL_PRODUTORES = "CREATE TABLE IF NOT EXISTS tb_Produtor (" +
            "MobileProdutorID integer primary key autoincrement, " +
            "CodProdutor, " +
            "Nome, " +
            "Tipo, " +
            "RTR, " +
            "Email, " +
            "CPF, " +
            "Telefone1, " +
            "Telefone2, " +
            "CEP, " +
            "Estado, " +
            "Cidade, " +
            "IBGE, " +
            "Bairro, " +
            "Endereco, " +
            "Numero, " +
            "Complemento, " +
            "Nascimento, " +
            "Pessoa, " +
            "Senha, " +
            "CreditoSugestao, " +
            "CreditoAprovado, " +
            "Exportou" +
            ")";

    private static String SQL_PRODUTOR_ENDERECO = "CREATE TABLE IF NOT EXISTS tb_Produtor_Endereco (" +
            "MobileEnderecoID integer primary key autoincrement, " +
            "CodProdutor, " +
            "CodFazenda, " +
            "Estado, " +
            "IBGE, " +
            "RazaoSocial, " +
            "NomeFantasia, " +
            "Inscricao, " +
            "Telefone, " +
            "Telefone2, " +
            "Localizacao, " +
            "Latitude, " +
            "Longitude, " +
            "Exportou" +
            ")";

    private static String SQL_PRODUTOR_ENDERECO_AREA = "CREATE TABLE IF NOT EXISTS tb_Produtor_Endereco_Area (MobileAreaID integer primary key autoincrement, " +
            "CodProdutor, " +
            "CodFazenda, " +
            "CulturaSAPID, " +
            "CulturaID, " +
            "EnderecoArea, " +
            "EnderecoProdutividade, " +
            "Ano, " +
            "AnoSafra, " +
            "Exportou" +
            ")";

    private static String SQL_PRODUTOR_TALHAO = "CREATE TABLE IF NOT EXISTS tb_Produtor_Endereco_Talhao (" +
            "MobileTalhaoID integer primary key autoincrement, " +
            "CodProdutor, " +
            "CodFazenda, " +
            "CulturaSAPID, " +
            "CulturaID, " +
            "Descricao, " +
            "Area, " +
            "Ano, " +
            "AnoSafra, " +
            "HashTalhao, " +
            "Coordenadas, " +
            "Exportou" +
            ")";

    private static String SQL_PRODUTOR_FAMILIA = "CREATE TABLE IF NOT EXISTS tb_Produtor_Familia (" +
            "MobileFamiliaID integer primary key autoincrement, " +
            "CodProdutor, " +
            "Parentesco, " +
            "Nome, " +
            "Email, " +
            "Nascimento, " +
            "Telefone, " +
            "Exportou" +
            ")";


    private static String SQL_STATUS_USER = "CREATE TABLE IF NOT EXISTS tb_Status_User (" +
            "MobileStatusUserID integer primary key autoincrement, " +
            "CD_STATUS" +
            ")";


    private static String SQL_TABELA_PRECO = "CREATE TABLE IF NOT EXISTS tb_Tabela_Preco (" +
            "MobileTabelaPrecoID integer primary key autoincrement, " +
            "CodTabela, " +
            "Categoria, " +
            "Descricao, " +
            "TaxaJuros, " +
            "DataJuros, " +
            "ComissaoPadrao, " +
            "CodIndexador, " +
            "Safra, " +
            "CulturaSAPID, " +
            "CulturaID" +
            ")";

    private static String SQL_TABELA_PRECO_PRODUTO = "CREATE TABLE IF NOT EXISTS tb_Tabela_Preco_Produto (" +
            "MobileTabelaPrecoProdutoID integer primary key autoincrement, " +
            "CodTabela, " +
            "CodCategoria, " +
            "CodProduto, " +
            "Valor, " +
            "Negociacao, " +
            "Descricao, " +
            "Detalhes" +
            ")";

    private static String SQL_VENCIMENTO = "CREATE TABLE IF NOT EXISTS tb_Vencimento (" +
            "MobileVencimentoID integer primary key autoincrement, " +
            "CodModoPagamento, " +
            "CodFormaPagamento, " +
            "Safra, " +
            "DataVencimento, " +
            "CulturaID, " +
            "CodDistribuidorUnidade" +
            ")";

    private static String SQL_VISITA = "CREATE TABLE IF NOT EXISTS tb_Visita (" +
            "MobileVisitaID integer primary key autoincrement, " +
            "ID, " +
            "CodProdutor, " +
            "CodFazenda, " +
            "Inicio, " +
            "Fim, " +
            "Latitude, " +
            "Longitude, " +
            "Altitude, " +
            "Hash, " +
            "Exportou" +
            ")";

    @Override
    public void onCreate(SQLiteDatabase db){

        db.execSQL(SQL_AGENDA);
        db.execSQL(SQL_AREAS);
        db.execSQL(SQL_CATEGORIAS);
        db.execSQL(SQL_CIDADE_VENDEDOR);
        db.execSQL(SQL_CIDADES);
        db.execSQL(SQL_COTACAO_INDEXADOR);
        db.execSQL(SQL_CULTURA);
        db.execSQL(SQL_CULTURA_SAP);
        db.execSQL(SQL_ESTADOS);
        db.execSQL(SQL_FAMILIA_CONCESSIONARIA);
        db.execSQL(SQL_FAZENDA);
        db.execSQL(SQL_FORMA_PAGAMENTO);
        db.execSQL(SQL_GRUPO);
        db.execSQL(SQL_INDEXADORES);
        db.execSQL(SQL_MAQUINA_HORIMETROS);
        db.execSQL(SQL_MAQUINA_MANUTENCOES);
        db.execSQL(SQL_MAQUINAS);
        db.execSQL(SQL_MARCAS);
        db.execSQL(SQL_MENSAGENS);
        db.execSQL(SQL_MENSAGENS_HISTOTICO);
        db.execSQL(SQL_MODELO_MANUTENCOES);
        db.execSQL(SQL_MODELOS);
        db.execSQL(SQL_MODO_PAGAMENTO);
        db.execSQL(SQL_MOTIVO_RECUSA);
        db.execSQL(SQL_PEDIDO_FATURAS);
        db.execSQL(SQL_PEDIDO_ITENS);
        db.execSQL(SQL_PEDIDO_STATUS);
        db.execSQL(SQL_PEDIDOS);
        db.execSQL(SQL_PIN_ANALISE_CONCORRENCIA);
        db.execSQL(SQL_PIN_CONCORRENTE);
        db.execSQL(SQL_PIN_PLANO_ACAO);
        db.execSQL(SQL_PIN_PLANO_ACAO_PILAR);
        db.execSQL(SQL_PIN_SWOT);
        db.execSQL(SQL_PIN_TIPO);
        db.execSQL(SQL_PIN_VISITA);
        db.execSQL(SQL_PRODUTO_ESTOQUE);
        db.execSQL(SQL_PRODUTOS);
        db.execSQL(SQL_PRODUTOR_ENDERECO);
        db.execSQL(SQL_PRODUTOR_ENDERECO_AREA);
        db.execSQL(SQL_PRODUTOR_FAMILIA);
        db.execSQL(SQL_PRODUTOR_TALHAO);
        db.execSQL(SQL_PRODUTORES);
        db.execSQL(SQL_STATUS_USER);
        db.execSQL(SQL_TABELA_PRECO);
        db.execSQL(SQL_TABELA_PRECO_PRODUTO);
        db.execSQL(SQL_VENCIMENTO);
        db.execSQL(SQL_VISITA);



    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int VersaoAntiga, int VersaoNova){

        //String sql = "ALTER TABLE ...";

    }

}
