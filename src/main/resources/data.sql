insert into fund_entity(NAME, TYPE) values ('Fundusz Polski 1', 0);
insert into fund_entity(NAME, TYPE) values ('Fundusz Polski 2', 0);
insert into fund_entity(NAME, TYPE) values ('Fundusz Zagraniczny 1', 1);
insert into fund_entity(NAME, TYPE) values ('Fundusz Zagraniczny 2', 1);
insert into fund_entity(NAME, TYPE) values ('Fundusz Zagraniczny 3', 1);
insert into fund_entity(NAME, TYPE) values ('Fundusz Pieniężny 1', 2);

insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (1, 0, 20);
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (2, 1, 75);
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (3, 2, 5);

insert into style_entity (ID, NAME) values (1, 0);

insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (1, 1);
insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (1, 2);
insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (1, 3);