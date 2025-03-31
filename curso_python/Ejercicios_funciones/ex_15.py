def clasificar_estudiantes(**datos):
    aprobados = []
    suspensos = []
    for alumno, nota in datos.items():
        if (nota >= 6):
            aprobados.append(alumno)
        else:
            suspensos.append(alumno)
    return aprobados, suspensos

dicc = {"manuel": 6, "antonio": 5, "paco": 9, "jose": 4}
aprobados, suspensos = clasificar_estudiantes(**dicc)
print("Aprobados:", aprobados)
print("Suspensos:", suspensos)
