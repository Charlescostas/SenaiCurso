var textoElemento = document.getElementsByClassName('title-news-today')[0]

async function getPegaNoticia() {
    var response = await ('https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release')
    var data = await response.json()
    
    return data.items[0].titulo
}

document.addEventListener('DOMContentLoaded', async () => {
    var titulo = await getPegaNoticia()
    textoElemento.innerText = titulo
})