var Vault = artifacts.require("./Vault.sol");

module.exports = function(deployer) {
    deployer.deploy(Vault); //stability
    deployer.deploy(Vault); //projects
};
