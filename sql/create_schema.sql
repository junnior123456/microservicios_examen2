-- Crear tablas

CREATE TABLE IF NOT EXISTS area (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    etapa VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS equipo (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    responsable VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS detalle (
    id SERIAL PRIMARY KEY,
    descripcion TEXT,
    evidencia TEXT,
    resultado TEXT,
    area_id INTEGER NOT NULL,
    CONSTRAINT fk_area FOREIGN KEY(area_id) REFERENCES area(id) ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS resultado (
    id SERIAL PRIMARY KEY,
    puntaje INTEGER,
    equipo_id INTEGER,
    detalle_id INTEGER,
    CONSTRAINT fk_equipo FOREIGN KEY(equipo_id) REFERENCES equipo(id) ON DELETE SET NULL,
    CONSTRAINT fk_detalle FOREIGN KEY(detalle_id) REFERENCES detalle(id) ON DELETE SET NULL
);