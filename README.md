# Detona Movies API

**Version**: 1.0  
**Base URL**: `http://191.252.92.39:8080/detona-movies-api/`

## Descrição

A **Detona Movies API** é uma API gratuita desenvolvida para fornecer uma lista de filmes, que pode ser usada em projetos pessoais ou comerciais. Ela retorna informações detalhadas sobre cada filme, incluindo título, data de lançamento, avaliação e mais.

## Documentação da API

A documentação da API está disponível via Swagger, facilitando a exploração e o teste dos endpoints.  
Acesse a documentação completa:  
[Swagger UI](http://191.252.92.39:8080/swagger-ui/index.html)

### Exemplo de Resposta

```json
[
    {
        "id": "1",
        "picture": "http://exemplo.com/imagem.jpg",
        "title": "Exemplo de Filme",
        "description": "Descrição do filme",
        "release_date": 1680000000000,
        "rating": 8,
        "trailer": "http://exemplo.com/trailer",
        "category": "DRAMA"
    },
    {
        "id": "2",
        "picture": "http://exemplo.com/imagem2.jpg",
        "title": "Outro Filme Exemplo",
        "description": "Outra descrição do filme",
        "release_date": 1670000000000,
        "rating": 7,
        "trailer": "http://exemplo.com/trailer2",
        "category": "SUSPENSE"
    }
]
```

## Endpoints

### `GET /detona-movies-api`

**Descrição**: Retorna uma lista de filmes.  
**Método**: `GET`  
**Respostas**:
- **200**: Sucesso ao buscar os filmes.
- **500**: Erro interno ao realizar a busca.

#### Exemplo de Requisição

```bash
curl -X GET "http://191.252.92.39:8080/detona-movies-api/" -H "accept: application/json"
```

### Modelo de Filme

```json
{
    "id": "string",
    "picture": "string",
    "title": "string",
    "description": "string",
    "release_date": "timestamp",
    "rating": "integer",
    "trailer": "string",
    "category": "enum(SUSPENSE, DRAMA, DOCUMENTARIO, TERROR, FICCAO_CIENTIFICA)"
}
```

## Categorias Disponíveis

- **SUSPENSE**
- **DRAMA**
- **DOCUMENTARIO**
- **TERROR**
- **FICCAO_CIENTIFICA**

### Tecnologias utilizadas
- Spring Boot
- Java
- Swagger Open API

## Instalação e Execução

Para rodar esta aplicação localmente:

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/detona-movies-api.git
    ```

2. Execute o projeto. 

## Autor
Desenvolvido por @EliezerBrasilian.
