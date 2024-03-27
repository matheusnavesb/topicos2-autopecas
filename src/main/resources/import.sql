--insert into peca (nome, preco, descricao) values( 'PECA NUMERO 1', 299.99 ,'DESCRICAO DA PECA NUMERO 1');
--insert into peca (nome, preco, descricao) values( 'PECA NUMERO 2', 299.99 ,'DESCRICAO DA PECA NUMERO 2');
--insert into peca (nome, preco, descricao) values( 'PECA NUMERO 3', 299.99 ,'DESCRICAO DA PECA NUMERO 3');

--insert into suspensaopadrao (id, dadostecnicos, compatibilidade) values (1, 'NOVA, linha 2024', 'FIAT-HATCHS');
--insert into suspensaopadrao (id, dadostecnicos, compatibilidade) values (2, 'NOVA, linha 2024', 'FIAT-SEDANS');
--insert into suspensaopadrao (id, dadostecnicos, compatibilidade) values (3, 'USADA, linha 2024', 'CHEVROLET-HATCHS');

insert into dadostecnicos (modelo, fabricante, garantia, embalagem, peso) 
values ('modelo 00', 'fabricante 1', '1 ano', '40x20x40cm (Largura X Altura X Profundidade)', '8 kg');
insert into dadostecnicos (modelo, fabricante, garantia, embalagem, peso) 
values ('modelo 10', 'fabricante 2', '2 anos', '40x20x40cm (Largura X Altura X Profundidade)', '8 kg');
insert into dadostecnicos (modelo, fabricante, garantia, embalagem, peso) 
values ('modelo 20', 'fabricante 3', '3 anos', '45x20x45cm (Largura X Altura X Profundidade)', '10 kg');

insert into peca (nome, preco, descricao) values( 'PECA NUMERO 1', 299.99 ,'DESCRICAO DA PECA NUMERO 1');
insert into peca (nome, preco, descricao) values( 'PECA NUMERO 2', 299.99 ,'DESCRICAO DA PECA NUMERO 2');
insert into peca (nome, preco, descricao) values( 'PECA NUMERO 3', 299.99 ,'DESCRICAO DA PECA NUMERO 3');

insert into suspensaopadrao (id, compatibilidade, id_dadostecnicos) values (1, 'NOVA, linha 2024', 1);
insert into suspensaopadrao (id, compatibilidade, id_dadostecnicos) values (2, 'NOVA, linha 2024', 2);
insert into suspensaopadrao (id, compatibilidade, id_dadostecnicos) values (3, 'USADA, linha 2024', 3);

