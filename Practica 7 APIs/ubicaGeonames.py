import requests

def obtener_informacion_ubicacion(geonames_username, lugar):
    url = f"http://api.geonames.org/searchJSON?name={lugar}&maxRows=1&username={geonames_username}"

    try:
        response = requests.get(url)
        response.raise_for_status()
        data = response.json()
        if "geonames" in data and len(data["geonames"]) > 0:
            ubicacion = data["geonames"][0]
            return ubicacion
        else:
            print("Ubicación no encontrada.")
            return None
    except requests.exceptions.HTTPError as http_err:
        print(f"Error HTTP: {http_err}")
    except requests.exceptions.ConnectionError as conn_err:
        print(f"Error de conexión: {conn_err}")
    except requests.exceptions.Timeout as timeout_err:
        print(f"Tiempo de espera agotado: {timeout_err}")
    except requests.exceptions.RequestException as req_err:
        print(f"Error en la solicitud: {req_err}")
        return None

if __name__ == "__main__":
    #Coloca tu usuario de geonames
    geonames_username = "andrew"

    lugar = "México"  # Cambia esto a la ubicación que desees consultar
    obtener_informacion_ubicacion(geonames_username, lugar)
