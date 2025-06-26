package factory.transport.impl;

/**
 * Интерфейс для транспорта.
 */
public interface Transport {

   /**
    * Выполняет доставку и возвращает сообщение о результате.
    *
    * @return строковое описание выполненной доставки
    *
    */
   String deliver();

}

