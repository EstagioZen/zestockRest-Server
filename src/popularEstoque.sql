/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  gedsonfaria
 * Created: 04/07/2017
 */
INSERT INTO tb_usuario (nome_usuario, registro_funcional, email, senha, theme)
VALUES ('Gedson Faria', NULL, 'gedson.faria@ufms.br', '123', NULL);
INSERT INTO tb_usuario (nome_usuario, registro_funcional, email, senha, theme)
VALUES ('Cizenando Galvao de Lima Junior', NULL, 'cizenando.junior@ufms.br', '123', NULL);
INSERT INTO tb_usuario (nome_usuario, registro_funcional, email, senha, theme)
VALUES ('Ze do Orgulho Ferido', NULL, 'zof@zemail.com', '123', NULL);
INSERT INTO tb_usuario (nome_usuario, registro_funcional, email, senha, theme)
VALUES ('Kleber Kruger', NULL, 'kleber.kruger@ufms.br', '123', NULL);


INSERT INTO tb_unidade (unidade)
VALUES ('UNIDADE');
INSERT INTO tb_unidade (unidade)
VALUES ('CAIXA');
INSERT INTO tb_unidade (unidade)
VALUES ('GARRAFA');
INSERT INTO tb_unidade (unidade)
VALUES ('FRASCO');
INSERT INTO tb_unidade (unidade)
VALUES ('PACOTE');
INSERT INTO tb_unidade (unidade)
VALUES ('FARDO');
INSERT INTO tb_unidade (unidade)
VALUES ('SACA');
INSERT INTO tb_unidade (unidade)
VALUES ('SACOLA');


INSERT INTO tb_fabricante (fabricante)
VALUES ('APPLE');
INSERT INTO tb_fabricante (fabricante)
VALUES ('SAMSUNG');
INSERT INTO tb_fabricante (fabricante)
VALUES ('LG');
INSERT INTO tb_fabricante (fabricante)
VALUES ('CONSUL');
INSERT INTO tb_fabricante (fabricante)
VALUES ('BRASTEMP');
INSERT INTO tb_fabricante (fabricante)
VALUES ('ZEISS');
INSERT INTO tb_fabricante (fabricante)
VALUES ('JOCAR OFFICE');
INSERT INTO tb_fabricante (fabricante)
VALUES ('OFFICE DEALER');

INSERT INTO tb_status_emprestimo_bem_permanente (descricao)
VALUES ('PENDENTE');
INSERT INTO tb_status_emprestimo_bem_permanente (descricao)
VALUES ('APROVADO');
INSERT INTO tb_status_emprestimo_bem_permanente (descricao)
VALUES ('EMPRESTADO');
INSERT INTO tb_status_emprestimo_bem_permanente (descricao)
VALUES ('DEVOLVIDO');
INSERT INTO tb_status_emprestimo_bem_permanente (descricao)
VALUES ('ATRASADO');

INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000001', 'CANETA PARA QUADRO BRANCO', 'COR AZUL', 1);
INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000002', 'CANETA PARA QUADRO BRANCO', 'COR VERMELHA', 1);
INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000003', 'CANETA PARA QUADRO BRANCO', 'COR VERDE', 1);
INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000004', 'CANETA PARA QUADRO BRANCO', 'COR PRETA', 1);
INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000005', 'GUARDANAPOS DE PAPEL', '20X20CM', 1);
INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000006', 'GUARDANAPOS DE PAPEL', '30X30CM', 1);
INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000007', 'COPO DE VIDRO', 'TIPO AMERICANO 200ML', 1);
INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000008', 'COPO DE VIDRO', 'TIPO TAÇA 300ML', 1);
INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000009', 'COPO DE VIDRO', 'TIPO RETO/LISO 300ML', 1);
INSERT INTO tb_produto_consumo (codigo_barra, descricao, especificacao, id_unidade)
VALUES ('0000000000010', 'COPO DE VIDRO', 'TIPO REQUEIJÃO', 1);

INSERT INTO tb_consumo (id_produto, id_fabricante, dt_fabricacao, dt_validade, quantidade_em_estoque, id_quem_recebeu, dt_quando_recebeu)
VALUES (1, NULL, '2017-07-06', '2017-07-06', 15, 1, '2017-07-06');
INSERT INTO tb_consumo (id_produto, id_fabricante, dt_fabricacao, dt_validade, quantidade_em_estoque, id_quem_recebeu, dt_quando_recebeu)
VALUES (2, NULL, '2017-07-06', '2017-07-06', 10, 1, '2017-07-06');

INSERT INTO tb_estado_bem_permanente (id_estado_bem_permanente, descricao_estado_fisico)
VALUES ('1', 'ÓTIMO');
INSERT INTO tb_estado_bem_permanente (id_estado_bem_permanente, descricao_estado_fisico)
VALUES ('2', 'BOM');
INSERT INTO tb_estado_bem_permanente (id_estado_bem_permanente, descricao_estado_fisico)
VALUES ('3', 'RUIM');
INSERT INTO tb_estado_bem_permanente (id_estado_bem_permanente, descricao_estado_fisico)
VALUES ('4', 'INUTILIZÁVEL');

INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'Biblioteca', NULL);
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'Lab.Informática', NULL);
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8001');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8002');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8003');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8004');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8005');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8006');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8007');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8008');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8009');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8010');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8011');
INSERT INTO tb_locais_lotacao_bem_permanente (unidade_setorial, setor, sala)
VALUES ('CPCX', 'H', '8012');

INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('CADEIRA GIRATORIA ZEISS', '2017-07-31', 1, 'ELA GIRA', '00000001', '1', 3);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('CADEIRA GIRATORIA ZEISS', '2017-07-31', 1, 'ELA GIRA', '00000002', '1', 3);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('CADEIRA GIRATORIA ZEISS', '2017-07-31', 1, 'ELA GIRA', '00000003', '1', 3);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('CADEIRA GIRATORIA ZEISS', '2017-07-31', 1, 'ELA GIRA', '00000004', '1', 3);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('CADEIRA GIRATORIA ZEISS', '2017-07-31', 1, 'ELA GIRA', '00000005', '2', 3);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('MICROSCÓPIO ZEISS', '2017-07-31', 3, 'X100 focus', '00000006', '3', 1);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('MICROSCÓPIO ZEISS', '2017-07-31', 3, 'X100 focus', '00000007', '1', NULL);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('MICROSCÓPIO ZEISS', '2017-07-31', 3, 'X100 focus', '00000008', '1', NULL);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('MICROSCÓPIO ZEISS', '2017-07-31', 3, 'X100 focus', '00000009', '1', NULL);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('MICROSCÓPIO ZEISS', '2017-07-31', 3, 'X100 focus', '00000010', '1', NULL);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('MICROSCÓPIO ZEISS', '2017-07-31', 3, 'X100 focus', '00000011', '2', NULL);
INSERT INTO tb_bem_permanente (descricao_bem, dt_entrada, sala_alocacao, observacao, num_patrimonio, id_estado_conservacao, id_co_responsavel)
VALUES ('MICROSCÓPIO ZEISS', '2017-07-31', 3, 'X100 focus', '00000012', '2', NULL);

INSERT INTO tb_emprestimo_bem_permanente (dt_prevista_retirada, justificativa, dt_prevista_devolucao, id_solicitante, id_num_patrimonio, id_status_emprestimo)
VALUES ('2017-10-26', 'teste', '2017-10-28', '3', '00000001', '1');
INSERT INTO tb_emprestimo_bem_permanente (dt_prevista_retirada, justificativa, dt_prevista_devolucao, id_solicitante, id_num_patrimonio, id_status_emprestimo)
VALUES ('2017-10-26', 'teste', '2017-10-28', '3', '00000002', '1');
INSERT INTO tb_emprestimo_bem_permanente (dt_prevista_retirada, justificativa, dt_prevista_devolucao, id_solicitante, id_num_patrimonio, id_status_emprestimo)
VALUES ('2017-10-26', 'teste', '2017-10-28', '3', '00000003', '1');
INSERT INTO tb_emprestimo_bem_permanente (dt_prevista_retirada, justificativa, dt_prevista_devolucao, id_solicitante, id_num_patrimonio, id_status_emprestimo)
VALUES ('2017-10-26', 'teste', '2017-10-28', '3', '00000004', '2');
INSERT INTO tb_emprestimo_bem_permanente (dt_prevista_retirada, justificativa, dt_prevista_devolucao, id_solicitante, id_num_patrimonio, id_status_emprestimo)
VALUES ('2017-10-26', 'teste', '2017-10-28', '3', '00000005', '2');
INSERT INTO tb_emprestimo_bem_permanente (dt_prevista_retirada, justificativa, dt_prevista_devolucao, id_solicitante, id_num_patrimonio, id_status_emprestimo)
VALUES ('2017-10-26', 'teste', '2017-10-28', '3', '00000006', '3');
INSERT INTO tb_emprestimo_bem_permanente (dt_prevista_retirada, justificativa, dt_prevista_devolucao, id_solicitante, id_num_patrimonio, id_status_emprestimo)
VALUES ('2017-10-26', 'teste', '2017-10-28', '3', '00000007', '4');
INSERT INTO tb_emprestimo_bem_permanente (dt_prevista_retirada, justificativa, dt_prevista_devolucao, id_solicitante, id_num_patrimonio, id_status_emprestimo)
VALUES ('2017-10-26', 'teste', '2017-10-28', '3', '00000008', '5');
INSERT INTO tb_emprestimo_bem_permanente (dt_prevista_retirada, justificativa, dt_prevista_devolucao, id_solicitante, id_num_patrimonio, id_status_emprestimo)
VALUES ('2017-10-26', 'teste', '2017-10-28', '3', '00000009', '5');

INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('1', '2017-10-26', '1', '3');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('2', '2017-10-26', '1', '3');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('3', '2017-10-26', '1', '3');

INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('4', '2017-10-26', '1', '3');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('4', '2017-10-27', '2', '3');

INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('5', '2017-10-26', '1', '3');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('5', '2017-10-27', '2', '3');

INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('6', '2017-10-26', '1', '3');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('6', '2017-10-27', '2', '3');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('6', '2017-10-27', '3', '3');

INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('7', '2017-10-26', '1', '3');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('7', '2017-10-27', '2', '3');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('7', '2017-10-27', '3', '3');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('7', '2017-10-28', '4', '3');

INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('8', '2017-10-26', '1', '4');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('8', '2017-10-27', '2', '4');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('8', '2017-10-27', '3', '4');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('8', '2017-10-29', '5', '4');

INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('9', '2017-10-26', '1', '4');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('9', '2017-10-27', '2', '4');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('9', '2017-10-27', '3', '4');
INSERT INTO tb_fases_emprestimo_bem_permanente (id_pedido_emprestimo, dt_status, id_status, id_responsavel)
VALUES ('9', '2017-10-29', '5', '4');