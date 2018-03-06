insert into fund_entity(NAME, TYPE) values ('Fundusz Polski 1', 0);
insert into fund_entity(NAME, TYPE) values ('Fundusz Polski 2', 0);
insert into fund_entity(NAME, TYPE) values ('Fundusz Zagraniczny 1', 1);
insert into fund_entity(NAME, TYPE) values ('Fundusz Zagraniczny 2', 1);
insert into fund_entity(NAME, TYPE) values ('Fundusz Zagraniczny 3', 1);
insert into fund_entity(NAME, TYPE) values ('Fundusz Pieniężny 1', 2);
insert into fund_entity(NAME, TYPE) values ('Fundusz Polski 3', 0);

--style SAFE
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (1, 0, 20);
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (2, 1, 75);
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (3, 2, 5);

insert into style_entity (ID, NAME) values (1, 0);

insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (1, 1);
insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (1, 2);
insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (1, 3);

--style BALANCED
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (4, 0, 30);
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (5, 1, 60);
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (6, 2, 10);

insert into style_entity (ID, NAME) values (2, 1);

insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (2, 4);
insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (2, 5);
insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (2, 6);

--style AGGRESIVE
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (7, 0, 40);
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (8, 1, 20);
insert into percent_of_fund_entity (ID, FUND_TYPE, PERCENT) values (9, 2, 40);

insert into style_entity (ID, NAME) values (3, 2);

insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (3, 7);
insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (3, 8);
insert into style_entity_percent_of_fund_entities(STYLE_ENTITY_ID, PERCENT_OF_FUND_ENTITIES_ID) values (3, 9);