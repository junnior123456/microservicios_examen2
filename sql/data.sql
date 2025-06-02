
INSERT INTO area (nombre, etapa) VALUES ('Calidad', 'Evaluación');
INSERT INTO area (nombre, etapa) VALUES ('Producción', 'Implementación');
INSERT INTO area (nombre, etapa) VALUES ('Administración', 'Planificación');

-- Insertar datos en equipo

INSERT INTO equipo (nombre, responsable) VALUES ('Equipo Alfa', 'Juan Pérez');
INSERT INTO equipo (nombre, responsable) VALUES ('Equipo Beta', 'María Gómez');
INSERT INTO equipo (nombre, responsable) VALUES ('Equipo Gamma', 'Carlos Ruiz');

-- Insertar datos en detalle

INSERT INTO detalle (descripcion, evidencia, resultado, area_id) VALUES ('Revisión de procesos', 'Informe y fotos', 'Cumple estándares', 1);
INSERT INTO detalle (descripcion, evidencia, resultado, area_id) VALUES ('Optimización de maquinaria', 'Reporte técnico', 'Mejora lograda', 2);
INSERT INTO detalle (descripcion, evidencia, resultado, area_id) VALUES ('Planificación anual', 'Documento de planificación', 'Aprobado', 3);

-- Insertar datos en resultado

INSERT INTO resultado (puntaje, equipo_id, detalle_id) VALUES (85, 1, 1);
INSERT INTO resultado (puntaje, equipo_id, detalle_id) VALUES (90, 2, 2);
INSERT INTO resultado (puntaje, equipo_id, detalle_id) VALUES (75, 3, 3);
INSERT INTO resultado (puntaje, equipo_id, detalle_id) VALUES (88, 1, 3);