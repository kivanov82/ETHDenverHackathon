var OurToken = artifacts.require("./OurToken.sol");

module.exports = function(deployer) {
    deployer.deploy(OurToken, 'OurToken', 'OUT', 18);
};
