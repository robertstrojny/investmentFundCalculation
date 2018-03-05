insert into FUNDENTITY(NAME, TYPE) values ('Fundusz Polski 1', 0);
insert into FUNDENTITY(NAME, TYPE) values ('Fundusz Polski 2', 0);
insert into FUNDENTITY(NAME, TYPE) values ('Fundusz Zagraniczny 1', 1);
insert into FUNDENTITY(NAME, TYPE) values ('Fundusz Zagraniczny 2', 1);
insert into FUNDENTITY(NAME, TYPE) values ('Fundusz Zagraniczny 3', 1);
insert into FUNDENTITY(NAME, TYPE) values ('Fundusz Pieniężny 1', 2);

insert into PERCENTOFFUNDENTITY (ID, FUNDTYPE, PERCENT) values (1, 0, 20);
insert into PERCENTOFFUNDENTITY (ID, FUNDTYPE, PERCENT) values (2, 1, 75);
insert into PERCENTOFFUNDENTITY (ID, FUNDTYPE, PERCENT) values (3, 2, 5);

insert into STYLEENTITY (ID, NAME) values (1, 'SAFE');

insert into STYLEENTITY_PERCENTOFFUNDENTITY(STYLEENTITY_ID, PERCENTOFFUNDENTITIES_ID) values (1, 1);
insert into STYLEENTITY_PERCENTOFFUNDENTITY(STYLEENTITY_ID, PERCENTOFFUNDENTITIES_ID) values (1, 2);
insert into STYLEENTITY_PERCENTOFFUNDENTITY(STYLEENTITY_ID, PERCENTOFFUNDENTITIES_ID) values (1, 3);