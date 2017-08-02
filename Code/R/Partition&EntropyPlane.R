library(ggplot2)
library(combinat)

partition<-function(series,size,delay){
  myPartition = matrix(ncol=size,nrow=ceiling(length(series)/delay))
  col = counter = i = 1
  init =0 
  if(length(levels(series))!=0){
    series = factor(series)
  }
  while(i <= length(series)){
    myPartition[counter,col] = series[i]
    col = col + 1
    if((col - 1) == size){
      i = init = init + delay 
      col = 1
      counter = counter + 1
      if((i + size + 1) > length(series)){
        counter = counter - 1
        break
      }
    }
    i = i + 1
  }
  myPartition[1:(counter),]
}

#Option
#Shannon 1
#Tsallis 2
#Renyi 3
#Min entropy 4
#OptionP
#Band and Pompe 1
#Bandt and Pompe weigth 2
entropyPlane<-function(partitions,dimension,delay,option=1,optionP=1,q=0){
  numberPartitions = dim(partitions)[1]
  if(is.null(numberPartitions)){
    numberPartitions = 1
  }
  entropy = rep(0,numberPartitions)
  probability = matrix(nrow=numberPartitions,ncol=factorial(dimension))
  if(optionP == 1){
    if(numberPartitions==1){
      probability[1,] = distribution(partitions,dimension,delay)
    }
    else{
      for(i in 1:numberPartitions){
        probability[i,] = distribution(partitions[i,],dimension,delay)
      }
    }
  }else if(optionP == 2){
    if(numberPartitions==1){
      probability[1,] = WPE(partitions,dimension,delay)
    }
    else{
      for(i in 1:numberPartitions){
        probability[i,] = WPE(partitions[i,],dimension,delay)
      }
    }
  }else{
    cat("Entropy option unavailable\n")
  }
  if(option == 1){
    for(i in 1:numberPartitions){
      entropy[i] = shannonEntropyNormalized(probability[i,])
    }
  }else if(option == 2){
    for(i in 1:numberPartitions){
      entropy[i] = tsallisEntropy(probability[i,],q)
    }
  }else if(option == 3){
    for(i in 1:numberPartitions){
      entropy[i] = renyiEntropy(probability[i,],q)
    }
  }else if(option == 4){
    for(i in 1:numberPartitions){
      entropy[i] = PMEUnidimensional(probability[i,])
    }
  }else{
    cat("Entropy option unavailable\n")
  }
  print(entropy)
  if(numberPartitions==1){
    qplot(x=c(1:numberPartitions),y=entropy,geom="point",xlab="Partitions-Time Series",ylab="Entropy") +
      ggtitle("Permutation Entropy Evolution") + theme(plot.title = element_text(hjust=0.5))
  }
  else{
    qplot(x=c(1:numberPartitions),y=entropy,geom="line",xlab="Partitions-Time Series",ylab="Entropy") +
      ggtitle("Permutation Entropy Evolution") + theme(plot.title = element_text(hjust=0.5))
  }
}

distancePlane<-function(partitions,dimension,delay,option=1,optionP=1,q=1){
  numberPartitions = dim(partitions)[1]
  if(is.null(numberPartitions)){
    numberPartitions = 1
  }
  distance = rep(0,numberPartitions)
  probability = matrix(nrow=numberPartitions,ncol=factorial(dimension))
  if(optionP == 1){
    if(numberPartitions==1){
      probability[1,] = distribution(partitions,dimension,delay)
    }
    else{
      for(i in 1:numberPartitions){
        probability[i,] = distribution(partitions[i,],dimension,delay)
      }
    }
  }else if(optionP == 2){
    if(numberPartitions==1){
      probability[1,] = WPE(partitions,dimension,delay)
    }
    else{
      for(i in 1:numberPartitions){
        probability[i,] = WPE(partitions[i,],dimension,delay)
      }
    }
  }else{
    cat("Distance option unavailable\n")
  }
  if(option == 1){
    for(i in 1:numberPartitions){
      distance[i] = euclidian_distance(probability[i,])
    }
  }else if(option == 2){
    for(i in 1:numberPartitions){
      distance[i] = euclidian_quadratica_distance(probability[i,])
    }
  }else if(option == 3){
    for(i in 1:numberPartitions){
      distance[i] = manhattan_distance(probability[i,])
    }
  }else if(option == 4){
    for(i in 1:numberPartitions){
      distance[i] = chebyshev_distance(probability[i,])
    }
  }else if(option == 5){
    for(i in 1:numberPartitions){
      distance[i] = kullback_leibler_divergence(probability[i,])
    }
  }else if(option == 6){
    for(i in 1:numberPartitions){
      distance[i] = hellinger_Distance(probability[i,])
    }
  }else if(option == 7){
    for(i in 1:numberPartitions){
      distance[i] = jensenDivergence(probability[i,])
    }
  }else if(option == 8){
    for(i in 1:numberPartitions){
      distance[i] = wootters_distance(probability[i,],q)
    }
  }else{
    cat("Distance option unavailable\n")
  }
  print(distance)
  if(numberPartitions==1){
    qplot(x=c(1:numberPartitions),y=distance,geom="point",xlab="Partitions-Time Series",ylab="Distance") +
      ggtitle("Stochastic distance Evolution") + theme(plot.title = element_text(hjust=0.5))
  }
  else{
    qplot(x=c(1:numberPartitions),y=distance,geom="line",xlab="Partitions-Time Series",ylab="Distance") +
      ggtitle("Stochastic distance Evolution") + theme(plot.title = element_text(hjust=0.5))
  }
}








