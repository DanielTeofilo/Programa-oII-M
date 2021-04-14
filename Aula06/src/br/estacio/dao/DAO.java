package br.estacio.dao;


public abstract class DAO<Entity> {
    
    public abstract boolean cadastrar(Entity e) throws Exception;
    public abstract boolean atualizar(Entity e) throws Exception;
    public abstract boolean excluir(Entity e) throws Exception;
    public abstract Integer getCodigo(Entity e) throws Exception;    
    
}
