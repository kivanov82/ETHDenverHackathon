pragma solidity ^0.4.18;

import 'zeppelin-solidity/contracts/token/ERC20/DetailedERC20.sol';

contract OurToken is DetailedERC20 {

    function OurToken(string _name, string _symbol, uint8 _decimals)
        DetailedERC20(_name, _symbol, _decimals){

    }
  
}
