Logistica <- function(tamanho, r, x0, descarte) {
  
  for(i in 1:descarte) {
    x1 <- r * x0*(1-x0)
    x0 <- x1
  }
  
  saida <- vector(mode="double", length=tamanho)
  saida[1] <- x0
  for(i in 2:tamanho) saida[i] <- r * saida[i-1]*(1-saida[i-1])
  
  return(saida)
}