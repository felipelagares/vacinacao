<%@ page import="java.util.List" %>
<%@ page import="negocio.User" %>
<%@ page import="negocio.Alergia" %>
<%@ page import="util.JPAUtil" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listagem de Usuários</title>
</head>
<body>
    <h2>Listagem de Usuários</h2>

    <%
        List<User> userList;
        try {
            // Obter o EntityManager usando a classe JPAUtil
            EntityManager entityManager = JPAUtil.getEntityManager();

            // Obter a lista de usuários
            userList = entityManager.createQuery("FROM User", User.class).getResultList();

            // Fechar o EntityManager
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println("Erro ao obter usuários.");
            return;
        }
    %>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
                <th>UF</th>
                <th>Sexo</th>
                <th>Alergias</th>
            </tr>
        </thead>
        <tbody>
            <% for (User user : userList) { %>
                <tr>
                    <td><%= user.getId() %></td>
                    <td><%= user.getNome() %></td>
                    <td><%= user.getCpf() %></td>
                    <td><%= user.getUF() %></td>
                    <td><%= user.getSexo() %></td>
                    <td>
                        <ul>
                            <% for (Alergia alergia : user.getAlergias()) { %>
                                <li><%= alergia.getNome() %></li>
                            <% } %>
                        </ul>
                    </td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
