# Security Policy

Antenna is currently pre-alpha.

## Security posture

Antenna should not include by default:

- Advertising SDKs.
- Telemetry.
- Analytics.
- Behavioural tracking.
- Unnecessary permissions.

## Reporting security issues

Until a formal process is established, report security issues privately to the repository maintainer rather than opening a public issue if the report includes exploitable details, secrets, or sensitive data.

## Sensitive data rules

Do not commit:

- API keys.
- Account tokens.
- Signing keys.
- Keystores.
- Passwords.
- Private configuration files.
- Production secrets.

## Production logging rules

Production logs must not include:

- Access tokens.
- Refresh tokens.
- Private user data.
- Full platform response payloads.
- Search history.
- Local favourites lists.
