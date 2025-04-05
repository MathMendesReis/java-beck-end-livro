create table products.product (
    id bigserial primary key,
    product_identifier varchar not null,
    nome varchar(100) not null,
    preco float not null,
    category_id bigint REFERENCES products.category(id)
);
INSERT INTO products. (id, product_identifier, nome, preco, category_id) VALUES
('550e8400-e29b-41d4-a716-446655440000', 'MOVEIS-001', 'Sofá de Couro', 1500.00, '4e5a1e91-daeb-48b6-bc01-97df57e49da2'),
('6ba7b810-9dad-11d1-80b4-00c04fd430c8', 'MOVEIS-002', 'Mesa de Jantar', 800.00, '4e5a1e91-daeb-48b6-bc01-97df57e49da2'),
('109156be-c4fb-4155-9b1b-33099951f531', 'ELETRONICOS-001', 'Smartphone', 1200.00, '860d6033-92c3-4f6f-8757-f4defea8687c'),
('123e4567-e89b-12d3-a456-426614174000', 'ELETRONICOS-002', 'Notebook', 2500.00, '860d6033-92c3-4f6f-8757-f4defea8687c'),
('1b9d6bcd-bbfd-4b2d-9b5d-ab8dfbbd4bed', 'MOVEIS-003', 'Cadeira de Escritório', 350.00, '4e5a1e91-daeb-48b6-bc01-97df57e49da2'),
('54457788-3333-1111-9999-112233445566', 'ELETRONICOS-003', 'Fones de Ouvido Bluetooth', 200.00, '860d6033-92c3-4f6f-8757-f4defea8687c');