package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entitiesenums.OrderStatus;

/**
 * Pedido simples para demonstrar uso de enum em status de negocio.
 */
public class Order {

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

  private Integer id;

  private LocalDateTime moment ;

  private OrderStatus status;

   public Order() {
    
  }

  public Order(Integer id, LocalDateTime moment, OrderStatus status) {
    this.id = id;
    this.moment = moment;
    this.status = status;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDateTime getMoment() {
    return moment;
  }

  public void setMoment(LocalDateTime moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  /**
   * Mantido para compatibilidade com exemplos antigos.
   */
  public OrderStatus getOrder() {
    return getStatus();
  }

  /**
   * Mantido para compatibilidade com exemplos antigos.
   */
  public void setOrder(OrderStatus order) {
    setStatus(order);
  }

  @Override
  public String toString() {
    return "Order id: " + id 
    + "\nMoment: " + moment.format(FORMATTER)
    + "\nStatus: " + status;
    
  }

  



}

