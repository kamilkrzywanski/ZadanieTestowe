insert into tabela_testowa VALUES ('1','wartoœæ1','wartoœæ2','wartoœæ3','1');
insert into tabela_testowa VALUES ('2','waroœæ21','wartoœæ22','wartoœæ23','5');
insert into tabela_testowa VALUES ('3','wartoœæ31','wartoœæ22','wartoœæ32','6');
insert into tabela_testowa VALUES ('4','wartoœæ54','wartoœæ43','wartoœæ45','4');
insert into tabela_testowa VALUES ('5','wartoœæ43','wartoœæ23','wartoœæ34','4');
insert into tabela_testowa VALUES ('6','wartoœæ43','wartoœæ54','wartoœæ43','2');
insert into tabela_testowa VALUES ('7','wartoœæ54','wartoœæ52','wartoœæ53','8');
insert into tabela_testowa VALUES ('8','wartoœæ21','wartoœæ2211','wartoœæ43','4');
insert into tabela_testowa VALUES ('9','wartoœæ43','wartoœæ33','wartoœæ45','9');
insert into tabela_testowa VALUES ('10','wartoœæ87','wartoœæ62','wartoœæ11','3');



// subselect - wolne rozwiązanie

select * from tabela_testowa a
where (select count(*) from tabela_testowa b
where b.kolumna1 = a.kolumna1) > 1

select * from tabela_testowa a
where (select count(*) from tabela_testowa b
where b.kolumna1 = a.kolumna1) <= 1


// join
// duplikaty

SELECT DISTINCT a.*
FROM tabela_testowa a
JOIN tabela_testowa b
ON a.kolumna1 = b.kolumna1
AND a.kolumna1 = b.kolumna1
AND a.id != b.id


//unikalne
SELECT * FROM tabela_testowa t1
LEFT JOIN tabela_testowa t2
ON t1.kolumna1 = t2.kolumna1
AND t1.id != t2.id
WHERE t2.id is  null