# Farmacia "Luz Divina" – Relaciones entre clases

Curso: Lenguajes de Programación – Facultad de Ingeniería, UPN
Docente: Edgard William Vilchez Valdez
Equipo Nº2

## Concepto

En la farmacia "Luz Divina", los productos farmacéuticos se organizan por
categorías terapéuticas como «Analgésicos y Antiinflamatorios». Una categoría
agrupa muchos medicamentos, y el personal se organiza jerárquicamente
(químico farmacéutico y técnicos). El proyecto modela estas situaciones con
dos tipos de relación entre clases, implementadas en Java y Python.

## Contenido

| Relación  | Clases                          | Java | Python |
|-----------|---------------------------------|------|--------|
| Binaria   | CategoriaFarmacia – Medicamento (1 a 0..*) | java/E1_BinariaFarmacia.java | python/E1_BinariaFarmacia.py |
| Reflexiva | PersonalFarmacia (supervisor 0..1 – subordinados 0..*) | java/E2_ReflexivaFarmacia.java | python/E2_ReflexivaFarmacia.py |

