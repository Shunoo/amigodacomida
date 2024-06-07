package amigodacomida.service.generic;

public interface GenericMapper <T,S>{
    public S convertToDto(T t);
    public T convertToModel(S s);
}
